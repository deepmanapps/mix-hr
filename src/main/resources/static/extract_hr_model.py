import PyPDF2
import re

# Open and read the PDF
pdf = open('OFBizDatamodelBook_Combined_20171001.pdf', 'rb')
reader = PyPDF2.PdfReader(pdf)

print(f"Total pages: {len(reader.pages)}\n")

# Extract all text and look for HR-related entities
hr_keywords = ['Employment', 'Employee', 'Position', 'Salary', 'Training', 
               'Performance', 'Leave', 'Termination', 'Recruitment', 'Payroll',
               'Benefit', 'Skill', 'Qualification', 'Department', 'JobRequisition']

for i in range(len(reader.pages)):
    page_text = reader.pages[i].extract_text()
    
    # Check if page contains HR-related keywords
    if any(keyword.lower() in page_text.lower() for keyword in hr_keywords):
        print(f"\n{'='*80}")
        print(f"PAGE {i+1} - Contains HR-related content")
        print(f"{'='*80}")
        print(page_text)
        print("\n")

pdf.close()
