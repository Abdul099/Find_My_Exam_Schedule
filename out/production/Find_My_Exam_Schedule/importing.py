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

def main():
    filename = Path('data.pdf')
    url = 'https://www.mcgill.ca/exams/files/exams/december_2019_final_exam_schedule_with_room_locationsd12.pdf'
    response = requests.get(url)
    filename.write_bytes(response.content)
 
    tables = tabula.read_pdf(url, pages = "all", multiple_tables = True)
    #print(tables)
    big_table = pd.concat(tables)
    print(big_table)
    big_table.to_csv("data.csv")


if __name__ == '__main__':
    main()