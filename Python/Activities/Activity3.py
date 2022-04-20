user1= input("Enter Name of Player1:")
user2= input("Enter Name of Player2:")

user1_choice=input( user1 + " Do you want to choose rock/paper/scissors" )
user2_choice=input( user2 + " Do you want to choose rock/paper/scissors" )

if user1_choice==user2_choice :
    print("its a tie")
elif user1_choice=='rock' and user2_choice =='paper':
    print("User2 wins")

elif user1_choice=='scissors' and user2_choice =='paper' :
    print("user1 wins")
elif user1_choice == 'paper':
    if user2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")





