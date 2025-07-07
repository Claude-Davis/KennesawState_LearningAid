# Starlan Davis
# Lab #9
# Due: 8 July 2025
# Purpose: program for password verification
# Resources:

lower_case_char = False
upper_case_char = False
def casing_check(contrasena):
    for a in contrasena:
        if a.islower():
            lower_case_char = True
            break
    for A in contrasena:
        if A.isupper():
            upper_case_char = True
            break

number_present = False
def number_check(contrasena):
    for n in contrasena:
        print(x)


password = input("Password: ")

if (len(password) < 9):  # verify length of password
    print("Invalid Password")
else:
    if ((not lower_case_char) or (not upper_case_char)):   # verify presence of lower and upper case letters
        print("Invalid Password")
    else:
        //