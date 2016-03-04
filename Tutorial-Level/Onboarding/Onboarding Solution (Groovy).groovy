input = new Scanner(System.in);

while (true) 
{
    enemy1 = input.next() // name of enemy 1
    dist1 = input.nextInt() // distance to enemy 1
    enemy2 = input.next() // name of enemy 2
    dist2 = input.nextInt() // distance to enemy 2

    
    if (dist1 < dist2)
        println enemy1
    else
        println enemy2
}
