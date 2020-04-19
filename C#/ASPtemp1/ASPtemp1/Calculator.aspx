<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Calculator.aspx.cs" Inherits="ASPtemp1.Calculator" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server" >
        <div >
            This is Calculator <br />
        </div>
        <asp:Label ID="Label1" runat="server" Text="Number1 : "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" AutoPostBack="true"></asp:TextBox>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Number2 : "></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server" AutoPostBack="true"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label3" runat="server" Text="Operator : "></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:DropDownList ID="DropDownList1" AutoPostBack="true" runat="server">
                <asp:ListItem>+</asp:ListItem>
                <asp:ListItem>-</asp:ListItem>
                <asp:ListItem>*</asp:ListItem>
                <asp:ListItem>/</asp:ListItem>
            </asp:DropDownList>
</p>
        <p>
            <asp:Button ID="Button_Calculate" runat="server"  Text="Calculate" OnClick="Button_Calculate_Click" />
        </p>
        <p>
            Answer : <asp:Label ID="Label_Answer" runat="server" Text="[Ans]" ></asp:Label>
        </p>
        <p>
            &nbsp;</p>
    </form>
</body>
</html>
