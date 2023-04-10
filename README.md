# pharmacy-application
<table>
        <thead>
            <tr>
                <th><strong>Table of Contents</strong></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><strong>1. About The Project</strong</td>
            </tr>
            <tr>
                <td><strong>2. Main Features</strong></td>
            </tr>
            <tr>
                <td><strong>3. Built With</strong></td>
            </tr>
     </tbody>
    </table>
    
<h2 id="about-the-project">1. About The Project</h2>
This Java Pharmacy program is designed to manage medicine stocks, process orders, and provide basic pharmacy management functionality. 
It allows users to place orders, view available stock, add new medicines, and perform other basic pharmacy management tasks. 
The program uses object-oriented programming principles to create classes for medicines, pharmacies, and brand and uses Java streams to process collections of objects. 
The program can be used as a basic template for developing more complex pharmacy management systems or as a standalone tool for managing small pharmacies.

<h2 id="main-features">2. Main Features</h2>

<h3>Medicine</h3>
• In my application I have a class called Medicine that represents a medicine. The class has instance variables that store information about the medicine, such as its name, price, production company, expiration date, and quantity. The class also has methods to set and get the values of these instance variables, as well as to verify the expiration date of the medicine.

•The class has two constructors: one that takes several arguments to set the instance variables, and another that takes only the name and quantity of the medicine. The class also has a method to set the unit of the medicine based on the unit code, and a toString() method that returns a formatted string representation of the medicine object.</br>

<h3>Pharmacy:</h3>
•My application contains a class called "Pharmacy", which represents a pharmacy that sells medicines. The class contains several instance variables, such as the pharmacy name, number of employees, medicine stock, city, etc., as well as various getter and setter methods to access and modify these variables.

•The class also contains several methods, including a method to set the pharmacy's schedule based on user input, a method to set the pharmacy type (online, in-store, or hybrid) based on user input, a method to check whether the pharmacy has a contract with the CAS (Romanian health insurance), a method to set the payment method (card or cash), a method to check whether customers can receive discounts with a purchasing card, a method to place an order for medicine, and a method to add new medicine to the pharmacy's stock.

•The class also has a method to validate whether a given email address is in a valid format and another method to check whether a given string consists of only digits. Additionally, there are several helper methods to fulfill an order and apply discounts to medicine. Overall, this class represents a model of a pharmacy and provides methods to interact with the pharmacy's data, including its schedule, type, stock, and orders.</br>

<h3>Brand:</h3>
•This Java code represents a class called "Brand", which is used in a pharmacy system. The class contains several methods that allow users to perform various tasks, such as displaying the total number of employees in all pharmacies, showing the available medicine in a specific city, finding pharmacies that accept card payments, displaying non-stop pharmacies, and showing the email and phone number of online and hybrid pharmacies.</br>

<h2 id="built-with">3. Built With</h2>

<b>Back end:</b>
<br\>
•Java Core
