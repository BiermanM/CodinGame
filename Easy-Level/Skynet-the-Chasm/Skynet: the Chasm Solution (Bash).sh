read road # road: the length of the road before the gap.
read gap # gap: the length of the gap.
read platform # platform: the length of the landing platform.

while [ true ]
do
    read speed # speed: the motorbike's speed.
    read coordX # coordX: the position on the road of the motorbike.
    
    if [ $coordX -eq $(( $road - 1 )) ]
    then
        echo "JUMP"
    elif [ $coordX -gt $(( $road - 1 )) ]
    then
        echo "SLOW"
    elif [ $speed -eq $(( $gap + 1 )) ]
    then
        echo "WAIT"
    elif [ $speed -gt $(( $gap + 1 )) ]
    then
        echo "SLOW"
    else
        echo "SPEED" # A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
    fi
done
