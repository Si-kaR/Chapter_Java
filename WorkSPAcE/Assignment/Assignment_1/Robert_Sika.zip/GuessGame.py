"""
--------------------------------------------------------------
Project: Number Guessing Game
Author: [ Robert Sika ]
Student ID: [ 89212025 ]
Date of Commencement: [Start Date]
Date of Completion: [ January 22, 2023 - Monday ]
University: [ Ashesi University ]
Faculty: [ Dr.Ayorkor Korsah ]
Faculty Intern: [ Elijah Boateng  &  Gideon . . . . ]
--------------------------------------------------------------
Description:
This Python script implements a number guessing game.
The user is prompted to guess a randomly generated number,
and the program provides feedback on each guess.
--------------------------------------------------------------
"""

def guess_game(seed: int) -> None:
    import random
    
    random.seed(seed)
    random_number = random.randint(1,100)
    
    guess = 0
    number_tries = 0
    
    while guess != random_number:
        try:
            guess = int(input("\nI am thinking of a number between 1 and 100. Guess the number > > > > > :  "))
            number_tries += 1
            
            if 1 <= guess <= 100:
                if guess == random_number:
                    print(f"You got it! It took you {number_tries}", end =" ")
                    if number_tries == 1:
                        print("try.")
                    else:
                        print("tries.")
                
                elif guess < random_number:
                    print("Your guess is too low.")
                    
                else:
                    print("Your guess is too high.")
                
            else:
                print("Invalid input")
        except:
            print("Please enter an integer > > > > > ")
            
guess_game(9)            



"""
--------------------------------------------
| **Function: guess_game**                 |
|------------------------------------------|
| **Input:** seed (int) - Seed for random  |
|   number generation.                     |
| **Output:** None                         |
|                                          |
| This function implements a simple        |
| number guessing game. It takes a seed    |
| for random number generation, generates  |
| a random number between 1 and 100, and   |
| prompts the user to guess the number.    |
| The game provides feedback on whether    |
| the guess is too low, too high, or       |
| correct. It also counts the number of    |
| tries and gives appropriate messages     |
| upon successful guessing.                |
|                                          |
| The function uses a while loop to        |
| repeatedly prompt the user for guesses   |
| until the correct number is guessed.     |
| Input validation ensures that the user   |
| enters a valid integer between 1 and     |
| 100. Exception handling is included to   |
| catch non-integer inputs.                |
|                                          |
| **Example Usage:**                       |
| guess_game(9)                            |
| I am thinking of a number between 1      |
| and 100. Guess the number: 50            |
| Your guess is too low.                   |
| I am thinking of a number between 1      |
| and 100. Guess the number: 75            |
| Your guess is too high.                  |
| I am thinking of a number between 1      |
| and 100. Guess the number: 63            |
| You got it! It only took you 3 tries.    |
--------------------------------------------
"""
