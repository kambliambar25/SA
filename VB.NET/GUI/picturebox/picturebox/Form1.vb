Public Class Form1
    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        If PictureBox1.Left < 500 Then
            PictureBox1.Left = PictureBox1.Left + 5
        End If
        If PictureBox1.Left > 500 Then
            PictureBox1.Left = 0
            Timer1.Stop()
            Timer1.Start()
        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Timer1.Start()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Timer1.Stop()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        PictureBox1.Left = 60
        Timer1.Stop()
    End Sub
End Class
