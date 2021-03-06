﻿Imports System.Data.SqlClient
Imports System.Data
Imports System.Configuration
Public Class Form1
    Dim conString As String = "Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=D:\Programs\VB.NET\My Codes\GUI\Insert-Delete-Update-Search\Insert-Delete-Update-Search\all-in-one database.mdf;Integrated Security=True;Connect Timeout=30"
    Dim con As New SqlConnection
    Dim cmd As New SqlCommand
    Dim ds As New DataSet
    Dim dt As New DataTable

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        datafill()
    End Sub

    Private Sub datafill()
        con.ConnectionString = conString
        cmd.Connection = con
        Try
            con.Open()
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try
        cmd.CommandText = "select * from stuTable"
        Dim da As New SqlDataAdapter(cmd)
        da.Fill(ds)
        da.Fill(dt)
        DataGridView1.DataSource = ds.Tables(0)
        con.Close()
    End Sub


    Private Sub btnInsert_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnInsert.Click
        con.ConnectionString = conString
        cmd.Connection = con
        con.Open()
        cmd.CommandText = "insert into stuTable (stuName, stuAddress) values('" & txtName.Text & "','" & txtAddress.Text & "')"
        cmd.ExecuteNonQuery()
        MsgBox("Data inserted successfully")
        con.Close()
        ds.Clear()
        datafill()
        ClearTextBox(Me)
    End Sub

    Private Sub btnUpdate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnUpdate.Click
        con.ConnectionString = conString
        cmd.Connection = con
        con.Open()
        cmd.CommandText = "update stuTable set stuName='" & txtName.Text & "', stuAddress = '" & txtAddress.Text & "'  where stuID='" & txtID.Text & "'"
        cmd.ExecuteNonQuery()
        MsgBox("Data updated successfully")
        con.Close()
        ds.Clear()
        datafill()
        ClearTextBox(Me)
    End Sub

    Private Sub ClearTextBox(ByVal frm As Form)
        For Each ctrl In frm.Controls
            If TypeOf ctrl Is TextBox Then
                ctrl.text = ""
            End If
        Next
    End Sub

    Private Sub DataGridView1Sub(ByVal sender As Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles DataGridView1.CellMouseDown, DataGridView1.CellMouseUp
        Dim id As Integer = DataGridView1.CurrentCell.RowIndex
        txtID.Text = ds.Tables(0).Rows(id)("stuID").ToString()
        txtName.Text = ds.Tables(0).Rows(id)("stuName").ToString()
        txtAddress.Text = ds.Tables(0).Rows(id)("stuAddress").ToString()
    End Sub

    Private Sub btnDelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        con.ConnectionString = conString
        cmd.Connection = con
        con.Open()
        cmd.CommandText = "delete from stuTable where stuID=" & txtID.Text
        cmd.ExecuteNonQuery()
        MsgBox("data is deleted")
        con.Close()
        ds.Clear()
        datafill()
        ClearTextBox(Me)
    End Sub


    Private Sub txtSearch_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtSearch.TextChanged
        DataGridView1.Refresh()
        Dim dv As New DataView(dt)
        dv.RowFilter = String.Format("stuName like '%{0}%'", txtSearch.Text)
        DataGridView1.DataSource = dv
    End Sub

    Private Sub DataGridView1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellContentClick

    End Sub
End Class
