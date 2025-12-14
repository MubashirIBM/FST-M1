user1 = input("What is the player1 name?")
user2 = input("What is the player2 name?")
while True:
    user1_answer = input(user1 + ", Do you want to choose rock, paper or scissors?").lower()
    user2_answer = input(user1 + ", Do you want to choose rock, paper or scissors?").lower()

    if user1_answer == user2_answer:
        print("It's a tie")
    elif user1_answer == 'rock':
        if user2_answer == 'scissor':
            print("Rock wins")
        else: 
            print("Paper wins")
    elif user1_answer == 'Scissors':
        if user2_answer == 'paper':
            print("Scissor win")
        else:
            print("Rock wins")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins")
        else:
            print("Scissor wins")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    repeat = input("Do you want to play one more round Yes /No").lower()
    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        print("You entered an invalid statement")
        raise SystemExit