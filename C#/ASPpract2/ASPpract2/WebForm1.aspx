<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="ASPpract2.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body >
    <form id="form1" runat="server">
        Enrollment Number :<asp:TextBox ID="Text_Enroll" runat="server" ></asp:TextBox>
        <p>
            Name :<asp:TextBox ID="Text_Name" runat="server" ></asp:TextBox>
        </p>
        <p>
            Semester :
            <asp:DropDownList ID="DropDown_Semester" runat="server" Height="16px" Width="49px">
                <asp:ListItem>1</asp:ListItem>
                <asp:ListItem>2</asp:ListItem>
                <asp:ListItem>3</asp:ListItem>
                <asp:ListItem>4</asp:ListItem>
                <asp:ListItem>5</asp:ListItem>
                <asp:ListItem>6</asp:ListItem>
                <asp:ListItem>7</asp:ListItem>
                <asp:ListItem>8</asp:ListItem>
                <asp:ListItem></asp:ListItem>
            </asp:DropDownList>
        </p>
        <p>
            Department :
            <asp:DropDownList ID="DropDown_Department" runat="server">
                <asp:ListItem>CSE</asp:ListItem>
                <asp:ListItem>MECH</asp:ListItem>
                <asp:ListItem>EC</asp:ListItem>
                <asp:ListItem>IC</asp:ListItem>
                <asp:ListItem>IT</asp:ListItem>
                <asp:ListItem></asp:ListItem>
            </asp:DropDownList>
        </p>
        <p>
            Gender :
            <asp:RadioButton ID="Radio_Male" name="Radio_Gender" runat="server"  Text="Male" />
            <asp:RadioButton ID="Radio_Female" name="Radio_Gender" runat="server" Text="Female" />
            <asp:RadioButton ID="Radio_Other" name="Radio_Gender" runat="server" Text="Other" />
            .</p>
        <p>
            Date of Birth :&nbsp;<input type="date" ID="DOB" runat="server"/>
        </p>
        <p>
            Password : <asp:TextBox ID="Text_Password" runat="server" ></asp:TextBox>
        </p>
        <p>
            Confirm Password :<asp:TextBox ID="Text_Confirm" runat="server" ></asp:TextBox>
        </p>
        <p>
            <asp:Button ID="Button_Submit" runat="server" Text="Submit" OnClick="Button_Submit_Click" />
            <asp:Button ID="Button_Clear" runat="server" Text="Clear" />
        </p>
    </form>
    </body>
</html>
