# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: file:///C:/Users/claud/AppData/Local/Temp/MicrosoftEdgeDownloads/d6305e02-206a-4459-96c5-bb6016d202da/lab11-sequence-types.pdf

#print("Lab.11.A. - All Math, All the Time")

def allMath():
    addition = num1 + num2
    subtraction = num1 - num2
    multiplication = num1 * num2
    if num2 == 0:
        division = None
        floor_division = None
        modulus = None
    else:
        division = num1 / num2
        floor_division = num1 // num2
        modulus = num1 % num2
    power = pow(num1, num2)
    #power = num1**num2   # alternative to the line above

    allMath_tuple = (addition, subtraction, multiplication, division, floor_division, modulus, power)

    return allMath_tuple

num1 = int(input("Enter your first number: "))
num2 = int(input("Enter yiur second number: "))

print("Your resulting tuple is", allMath())