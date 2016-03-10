# lightX: the X position of the light of power
# lightY: the Y position of the light of power
# initialTX: Thor's starting X position
# initialTY: Thor's starting Y position
read lightX lightY initialTX initialTY


while [ true ]
do
    read remainingTurns # remainingTurns: The remaining amount of turns Thor can move. Do not remove this line.
    
    direction=""
    
    if [ $initialTY -lt $lightY ]
    then
        direction="S"
        ((initialTY++))
    elif [ $initialTY -gt $lightY ]
    then
        direction="N"
        ((initialTY++))
    fi
    
    if [ $initialTX -lt $lightX ]
    then
        direction+="E"
        ((initialTX++))
    elif [ $initialTX -gt $lightX ]
    then
        direction+="W"
        ((initialTX++))
    fi
    
    
    
    echo $direction # A single line providing the move to be made: N NE E SE S SW W or NW
done
