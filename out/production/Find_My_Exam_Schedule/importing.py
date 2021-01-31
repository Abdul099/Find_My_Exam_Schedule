""""
Title: importer.py
Authors: Abdullatif Hassan & Beyza Yildirim
Date: January 31, 2021
"""
import sys
import requests
from pathlib import Path
import tabula
import camelot
import pandas as pd
import argparse

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("url")
    args = parser.parse_args()
    filename = Path('data.pdf')
    url = args.url
    response = requests.get(url)
    filename.write_bytes(response.content)
    tables = tabula.read_pdf(url, pages = "all", multiple_tables = True)
    big_table = pd.concat(tables).reset_index(drop=True)
    print(big_table)
    big_table.to_csv("data.csv", index=False)

if __name__ == '__main__':
    main()