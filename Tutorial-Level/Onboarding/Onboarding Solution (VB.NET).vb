Module Player

    Sub Main ()
        While True
            Dim enemy1 as String
            enemy1 = Console.ReadLine() ' name of enemy 1

            Dim dist1 as Integer
            dist1 = Console.ReadLine() ' distance to enemy 1

            Dim enemy2 as String
            enemy2 = Console.ReadLine() ' name of enemy 2

            Dim dist2 as Integer
            dist2 = Console.ReadLine() ' distance to enemy 2

            If dist1 < dist2 Then
                Console.WriteLine(enemy1)
            Else
                Console.WriteLine(enemy2)
            End If

        End While
    End Sub
End Module
