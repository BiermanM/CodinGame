read surfaceN # surfaceN: the number of points used to draw the surface of Mars.
for (( i=0; i<surfaceN; i++ ))
do
    # landX: X coordinate of a surface point. (0 to 6999)
    # landY: Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
    read landX landY
done

while [ true ]
do
    # hSpeed: the horizontal speed (in m/s), can be negative.
    # vSpeed: the vertical speed (in m/s), can be negative.
    # fuel: the quantity of remaining fuel in liters.
    # rotate: the rotation angle in degrees (-90 to 90).
    # power: the thrust power (0 to 4).
    read X Y hSpeed vSpeed fuel rotate power

    if [ $vSpeed -le -40 ]
    then
        power=4
    else
        power=0
    fi

    echo "$rotate $power" # 2 integers: rotate power. rotate is the desired rotation angle (should be 0 for level 1), power is the desired thrust power (0 to 4).
done
