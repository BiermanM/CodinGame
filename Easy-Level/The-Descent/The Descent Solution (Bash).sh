while ( true )
do
    declare -a arr
    max=0
    pos=0
    
    for (( i=0; i<8; i++ ))
    do
        read mountainH
        arr[i]=$mountainH
        
        echo Pos: $i is ${arr[i]} >&2
    
        if [ ${arr[i]} -gt $max ]
        then
            max=${arr[i]}
            pos=$i
        fi
    done

    echo $pos # The number of the mountain to fire on.
done
