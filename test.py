# Step 1: Define the Student class
class Student:
    def __init__(self, name):
        self.name = name
        self.grades = []  # List of tuples, e.g., [("Math", 88.5), ("Science", 92.0)]
    
    def add_grade(self, subject, grade):
        """Adds a subject and grade to the grades list."""
        self.grades.append((subject, grade))
    
    def get_average(self):
        """Calculates and returns the average grade."""
        if not self.grades:
            return "No grades available."
        total = sum(grade for _, grade in self.grades)  # Sum up all grades
        average = total / len(self.grades)
        return average
    
    def __str__(self):
        """Returns a string representation of the student."""
        return f"{self.name}: {self.grades}"


# Step 2: Main Program
def main():
    students = []  # List to store all student objects
    
    while True:
        # Display menu
        print("\nWelcome to the Student Management System!")
        print("1. Add Student")
        print("2. Add Grade")
        print("3. Calculate Average")
        print("4. Display All Students")
        print("5. Quit")
        
        # Get user choice
        choice = input("Enter your choice: ")
        
        # Option 1: Add Student
        if choice == "1":
            name = input("Enter the student's name: ")
            # Check for duplicate names
            if any(student.name == name for student in students):
                print("A student with this name already exists.")
            else:
                students.append(Student(name))
                print(f"Student {name} added!")
        
        # Option 2: Add Grade
        elif choice == "2":
            name = input("Enter the student's name: ")
            # Find the student
            student = next((s for s in students if s.name == name), None)
            if student:
                subject = input("Enter the subject: ")
                try:
                    grade = float(input("Enter the grade: "))
                    student.add_grade(subject, grade)
                    print(f"Grade added to {name}.")
                except ValueError:
                    print("Invalid grade. Please enter a number.")
            else:
                print("Student not found.")
        
        # Option 3: Calculate Average
        elif choice == "3":
            name = input("Enter the student's name: ")
            # Find the student
            student = next((s for s in students if s.name == name), None)
            if student:
                average = student.get_average()
                if isinstance(average, str):
                    print(average)  # "No grades available."
                else:
                    print(f"Average grade for {name}: {average:.2f}")
            else:
                print("Student not found.")
        
        # Option 4: Display All Students
        elif choice == "4":
            if students:
                print("Students and Grades:")
                for student in students:
                    print(student)  # Calls __str__ method of the Student class
            else:
                print("No students available.")
        
        # Option 5: Quit
        elif choice == "5":
            print("Goodbye!")
            break
        
        # Invalid Choice
        else:
            print("Invalid choice. Please select from the menu.")

# Run the program
if __name__ == "__main__":
    main()
