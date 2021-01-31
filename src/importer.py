""""
Title: importer.py
Authors: Abdullatif Hassan & Beyza Yildirim
Date: January 31, 2021
"""
import sys
import requests
from pathlib import Path

def main():
    filename = Path('data.pdf')
    url = 'https://www.mcgill.ca/exams/files/exams/december_2019_final_exam_schedule_with_room_locationsd12.pdf'
    response = requests.get(url)
    filename.write_bytes(response.content)
    

if __name__ == '__main__':
    main()
