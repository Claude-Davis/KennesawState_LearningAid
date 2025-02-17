# Classes & Subclasses

## Subclasses of Item:
    - Software
    - DigitalGood

## Sublclasses of Software:
    - VideoGame
    - DevelopmentKit

## Subclasses of DigitalGood:
    - Tradable
    - Collectable

## Pimary class: Main

-------

# All Imports
## Scanner (saved as "sc")
    - Imported and used in the Main file and to allow for inputs.

## ArrayList (saved as "items" and "targetPlatforms"(x2))
    - imported in both the Main and DevelopmentKit files.
        - Main, "items": Used to create an ArrayList of the Item class that would be used to store **ALL** objects that the user creates with the program.
        - Main, "targetPlatforms": Used to create an ArrayList of type String that wpuld be used in case 2 to store the user's platform names and then create an object of the DevelopmentKit class.
        - DevelopmentKit, "targetPlatforms": Used to create the attribute targetPlatforms to later store several String type inputs (platform names).

## DecimalFormat (saved as "df")
    - Imported in Item file and used in all files, except Main, in the toString() methods to format prices in the pattern "0.00".

-------

# Overview of File, "Main"
