def guess_game(seed: int) -> None:
    import random
    
    random.seed(seed)
    random_number = random.randint(1,100)
    
    guess = 0
    number_tries = 0
    
    while guess != random_number:
        try:
            guess = int(input("\nI am thinking of a number between 1 and 100. Guess the number: "))
            number_tries += 1
            
            if 1 <= guess <= 100:
                if guess == random_number:
                    print(f"You got it! It only took you {number_tries}", end =" ")
                    if number_tries == 1:
                        print("try.")
                    else:
                        print("tries.")
                
                elif guess < random_number:
                    print("Your guess is too low.")
                    
                elif guess > random_number:
                    print("your guess is too high.")
                
            else:
                print("Invalid input")
        except:
            print("Please enter an integer!")
            
guess_game(9)            