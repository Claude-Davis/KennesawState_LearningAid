class Student():
    def __init__(self, name):
        self.name = name
        self.grades = []

    def add_grades(self, subject, grade):
        grade_tuple = (subject, grade)
        self.grades.append(grade_tuple)
        print(self.grades)

    def get_average():
        print("Average grade for", self.name + ":", average)

    #def __str__():



def options():
    print("1. Add a student")
    print("2. Add grade")
    print("3. Calculate average")
    print("4. List students and grades")
    print("5. Quit")
    print(" ")

print("Welcome to the Student Management Center!")
print(" ")

options()
select_option = input("Enter your choice: ")

all_student_objects = []

run_program = True
while run_program:
    match select_option:
        case 1:
            name = input("Enter student name: ")
            s1 = Student(name)
            all_student_objects.append(s1)

            print("Student", name, "added!")
            print(" ")

            options()
            select_option = input("Enter your choice: ")

        case 2:
            name = input("Enter student name: ")
            subject = input("Enter subject: ")
            grade = float(input("Enter grade:"))

            for student in all_student_objects:
                if student == name:
                    student.add_grades(subject, grade)
            print("Grade added to", name + ".")

        case 3:
            name = input("Enter student name: ")
        case 5:
            print("Goodbye!")
            run_program = False
print("over")