# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: file:///C:/Users/claud/AppData/Local/Temp/MicrosoftEdgeDownloads/d6305e02-206a-4459-96c5-bb6016d202da/lab11-sequence-types.pdf
    # this program locates the position of a letter within a given word/phrase

#print("Lab.11.B. - Show Me Where It Is")

def letterPositions(phrase, letter):
    positions = []

    if letter.isupper():
        phrase = phrase.upper()
    if letter.islower():
        phrase = phrase.lower()

    for letter in phrase:
        if letter == phrase[letter]:
            positions.append(letter)


    letterPositions_tuple = (positions)
    return letterPositions_tuple

phrase = input("Enter your phrase: ")
letter = input("Enter your letter: ")

letterPositions(phrase, letter)