# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: file:///C:/Users/claud/AppData/Local/Temp/MicrosoftEdgeDownloads/df576507-c4d3-417b-9962-086c41f8cb0e/lab10-sequence-types.pdf

#print("Lab.10.B. - Remember Me")

friend_list = []

def options():
    print("1 - Add Friend")
    print("2 - List Friends")
    print("3 - Quit")

print("FRIEND LIST")
options()
select = input("Make your selection: ")

run_program = True

while run_program:

    match select:
        case "1":
            name = input("Enter your friend's name: ")
            age = input("Enter your friend's age: ")

            friend_tuple = ("Name: " + name, "Age: " + age)
            friend_list.append(friend_tuple)
            print("Friend Added")
            print(" ")

            options()
            select = input("Make your selection: ")
        
        case "2":
            for friend in friend_list:
                print(f"{friend[0]}, {friend[1]}")
            print(" ")

            options()
            select = input("Make your selection: ")

        case "3":
            print("Shutting down...")
            run_program = False
