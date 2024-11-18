# Date of Final: 18 November 2024
# Semester: Fall 2024
# Course: CSE 1321 Lab, Section BB

# Prompt: Create a system to organize and adopt out shelter dogs.





available_dogs = []

class Dog():
    def __init__(self, name, breed, age, weight):
        self.name = name
        self.breed = breed
        self.age = age
        self.weight = weight

    def introduce_dog(self, name):
        print(" ")
    
    def take_in(self,name):
        print(" ")


def adopt(name, breed):
    for dog in available_dogs:
        if name == dog[0] and breed == dog[1]:
                adopted_dog = dog
                available_dogs.remove(dog)
    return "You have adopted", name + "!"


dog0 = Dog("Rover", "Mix", 3, 60.7)
dog1 = Dog("Belle", "Golden Retriever", 9, 65.3)
dog2 = Dog("Jason", "German Shepherd/Labrador", 5, 82.6)

available_dogs.append((dog0.name, dog0.breed))
available_dogs.append((dog1.name, dog1.breed))
available_dogs.append((dog2.name, dog2.breed))


def options():
    print("1. See Available Dogs")
    print("2. Adopt A Dog")
    print("3. Drop Off A Dog")
    print("4. Exit Program")

options()
select = int(input("Enter a selection: "))


run = True
while run:
    match select:
        case 1:
            for dog in available_dogs:
                print(f"{dog[0]}- {dog[1]}")

            print(" ")

            options()
            select = int(input("Enter a selection: "))

        case 2:
            name = input("Enter dog's name: ")
            breed = input("Enter dog's breed: ")
            adopt(name, breed)
            
            print(" ")

            options()
            select = int(input("Enter a selection: "))

        #case 3:

        case 4:
            print("Goodbye!")
            run = False


"""
# AI - generated notes
Key Problems:
adopt() Function: It doesn't interact with the Dog objects; instead, it works with a tuple representation in available_dogs. This breaks the connection between the list and your class instances.
Dog Management: The Dog class could manage the functionality related to taking in and adopting dogs.
Duplication of Logic: Adding dogs to available_dogs as tuples makes it harder to use the class objects effectively.
Solution:
Let the Dog class handle more responsibilities. Modify the program to:

Use the Dog class for managing dogs directly (no tuples).
Create a method to manage adoptions and additions.

# AI - generated solution
class Dog:
    def __init__(self, name, breed, age, weight):
        self.name = name
        self.breed = breed
        self.age = age
        self.weight = weight

    def __str__(self):
        return f"{self.name} ({self.breed}, {self.age} years, {self.weight} lbs)"


class DogShelter:
    def __init__(self):
        self.available_dogs = []

    def add_dog(self, dog):
        self.available_dogs.append(dog)
        print(f"{dog.name} has been added to the shelter.")

    def list_dogs(self):
        if not self.available_dogs:
            print("No dogs available for adoption.")
        else:
            print("Dogs available for adoption:")
            for dog in self.available_dogs:
                print(dog)

    def adopt_dog(self, name):
        for dog in self.available_dogs:
            if dog.name.lower() == name.lower():
                self.available_dogs.remove(dog)
                print(f"Congratulations! You have adopted {dog.name}.")
                return
        print(f"Sorry, no dog named {name} is available for adoption.")


# Main program
shelter = DogShelter()
shelter.add_dog(Dog("Rover", "Mix", 3, 60.7))
shelter.add_dog(Dog("Belle", "Golden Retriever", 9, 65.3))
shelter.add_dog(Dog("Jason", "German Shepherd/Labrador", 5, 82.6))

def menu():
    print("\n1. See Available Dogs")
    print("2. Adopt A Dog")
    print("3. Drop Off A Dog")
    print("4. Exit Program")

run = True
while run:
    menu()
    choice = int(input("Enter your selection: "))

    if choice == 1:
        shelter.list_dogs()
    elif choice == 2:
        name = input("Enter the name of the dog to adopt: ")
        shelter.adopt_dog(name)
    elif choice == 3:
        name = input("Enter dog's name: ")
        breed = input("Enter dog's breed: ")
        age = int(input("Enter dog's age: "))
        weight = float(input("Enter dog's weight: "))
        shelter.add_dog(Dog(name, breed, age, weight))
    elif choice == 4:
        print("Goodbye!")
        run = False
    else:
        print("Invalid selection. Try again.")
"""