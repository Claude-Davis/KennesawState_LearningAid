# Lab7.py
# IT1114/Section W01
# Starlan Davis
# Lab #7
# Due: 1 July 2025
# Purpose: modify the class of lab 6 
# Resources: Lab6.py


# changes!
    # employeeNum -> numOfEmployees
    # hoursTotal -> hoursWorked
    # overtimeTotal -> overtimeHoursWorked

class Worker:
    def __init__(self):
        self.numOfEmployees = 0
        self.officeNum = 0
        self.name = "First Last"
        self.birthdate = "00/00/0000"
        self.hoursWorked = 0
        self.overtimeHoursWorked = 0
        self.hourlySalary = 0
        self.overtimeHourlyPay = 0


    def get_employee_number(self):
        return self.numOfEmployees
    def set_employee_number(self, x):
        self.numOfEmployees = x

    def get_office_number(self):
        return self.officeNum
    def set_office_number(self, x):
        self.officeNum = x
        if (self.officeNum <100) or (self.officeNum>500):
            return False
        return True


    def get_name(self):
        return self.name
    def set_name(self, x):
        self.name = x

    def set_birthdate(self, d, m, y):
        if (d<1):
            d = 1
            return False
        elif (d>31):
            d = 31
            return False
        if (m<1):
            m = 1
            return False
        elif (m>12):
            m = 12
            return False
        self.birthdate = str(d)+"/"+str(m)+"/"+str(y)
        return True

    def get_hours_worked(self):
        return self.hoursWorked
    def add_hours(self, x):
        if (x<=9):
            self.hoursWorked += x
        elif (x>9):
            self.hoursWorked += 9
            self.overtimeHoursWorked += (x-9)
    def get_hours_overtime(self):
        return self.overtimeHoursWorked
    
    def set_hourly_salary(self, x):
        if (x<0):
            self.hourlySalary = 0
            return False
        elif (x>=0):
            self.hourlySalary += x
            return True
        
    def set_overtime_salary(self, x):
        if(x<0):
            self.overtimeHourlyPay = 0
            return False
        elif (x>=0):
            self.overtimeHourlyPay += x
            return True
        
    def get_hourly_salary(self):
        return self.hourlySalary
    
    def get_overtime_salary(self):
        return self.overtimeHourlyPay
    
    def get_pay(self):
        pay = (self.hoursWorked * self.hourlySalary) + (self.overtimeHoursWorked + self.overtimeHourlyPay)
        return pay