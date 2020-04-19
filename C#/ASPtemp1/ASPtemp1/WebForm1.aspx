<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="ASPtemp1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <p>
            Welcome.....!!!</p>
        <p>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Click Me!" margin="50px" />
        </p>
        [<asp:Label ID="Label1" runat="server" Text="Label123"></asp:Label>
        ]<p>
            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="./Calculator.aspx">Calculator</asp:HyperLink>
        </p>
         ]<p>
            <asp:HyperLink ID="HyperLink2" runat="server" NavigateUrl="./AlterText.aspx">Alter Text</asp:HyperLink>
        </p>
        
    </form>
</body>
</html>
