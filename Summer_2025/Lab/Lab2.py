# Lab2.py
# IT1114/Section W01
# Starlan Davis
# Lab #2
# Due: 10 June 2025
# Purpose: Determines the total costs of food for customers.
# Resources:
        # used ChatGPT to find the method for rounding up, math.ceil() (used in line __)


import math

# user input; number of people who ordered foods
pizzaOrders = int(input("Pizza Orders: "))
saladOrders = int(input("Salad Orders: "))

# space/break
print (" ")

# output of order
totalPizzaSlices = pizzaOrders * 3
wholePizzas = math.ceil((totalPizzaSlices)/12)
totalSalads = saladOrders
print("You ordered " + str(wholePizzas) + " pizzas and " + str(totalSalads) + " salads. \n")


# delivery charge calculations
pizzaCost = wholePizzas * 15.99
saladCost = totalSalads * 7.99
deliveryCharge = (pizzaCost + saladCost) * 0.07

if (deliveryCharge < 20):
    deliveryCharge = 20
else:
    deliveryCharge = deliveryCharge


# pricing before discounts & delivery charge
print("Total cost of pizzas is $" + str(pizzaCost) + ".")
print("Total cost of salads is $" + str(saladCost) + ".")
print("Total Cost (pre Discounts & Delivery Fee): $" + str(pizzaCost+saladCost) + ".\n")


# discount calculations
totalDiscount = 0
if (wholePizzas <= 10):
    pizzaCost = 15.99 * wholePizzas
elif ( wholePizzas > 10):
    discount = (15.99 * wholePizzas) * 0.15
    pizzaCost -= discount
    totalDiscount += discount

if (totalSalads <= 10):
    saladCost = 7.99 * totalSalads
elif ( totalSalads > 10):
    discount = (7.99 * totalSalads) * 0.15
    saladCost -= discount
    totalDiscount += discount

print("Discount: $" + str(totalDiscount))
print("Delivery Fee: $" + str(float(deliveryCharge)))


# total price post all discounts and charges
totalPrice = pizzaCost + saladCost + deliveryCharge
print("Total Cost: $" + str(totalPrice))