# Semester: Fall 2024
# Name: Starlan Davis

# This is the code I created based on an AI-generated prompt for the purpose of practicing for my final exam (18 Nov. 2024) for CSE 1321, Section BB

# prompt: 



#print("Student Management System")

class Student():
    def __init__(self, name, grades):
        self.name = " "
        self.grades = []
    def add_grade(self, subject, grade):
        self.grades.append(tuple(subject,grade))
    def get_average():
        add = sum(student_grades)
        divide = add/len(courses_list)
        average = divide
    return

def options():
    print("1. Add Student")
    print("2. Add Grade")
    print("3. Calculate Average")
    print("4. Display All Students")
    print("5. Quit")
    print(" ")

student = Student(self, name, grades)

all_students = []

options()
user_choice = int(input("Enter your choice: "))

match user_choice:
    case 1:
        student_name = input("Enter student name: ")
        all_students.append(student_name)
        print("Student added!")
    case 2:
        student_name = input("Enter student name: ")
        subject  = input("Enter subject: ")
        grade = float(input("Enter grade: "))

        grades_tuple = (subject,grade)
        self.grades.append(grades_tuple)
    case 3:
        self.get_average()
    case 4:
        print(all)