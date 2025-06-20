import random

user = 0
comp = 0
# r - rock, p - paper, s - scissors
option = ['r', 'p', 's']
print("     Welcome to the Rock Paper Scissor Game!!\n")
rounds = int(input ("How many rounds do you want to play?\n >>> "))
while rounds > 0:
    user_in = input("""
Chose R - Rock,
     P - Paper, 
     S - Scissor
     or Q for Quit\n >>> """).lower()

    if user_in == 'q':
        break

    if user_in not in option:
        continue

    comp_pick = option[random.randint(0,2)]
    print("Computer chose: ", comp_pick.upper())
    rounds -= 1
    if user_in == comp_pick :
        print("Draw!")
    if user_in == 'r' and comp_pick == 's':
        print("You Win!")
        user += 1
    elif user_in == 'p' and comp_pick == 'r':
        print("You Win!")
        user += 1
    elif user_in == 's' and comp_pick == 'p':
        print("You Won!")
        user += 1
    else:
        print("You Lose!")
        print("Computer Won!")
        comp += 1
print("\n-----------------xxxxxx-------------------")
print("Game Over!")
print("You won: ", user, " times")
print("Computer won: ", comp, " times")
if user < comp:
    print("You Lose! Computer Smashed you! Hahaha")
else:
    print("You Win! Computer sucked! Hahaha")
