using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            { 
                double temp = double.Parse(text1.Text);
                temp += double.Parse(text2.Text);
                label4.Text = temp.ToString();
            }
            catch (FormatException fe)
            {
                MessageBox.Show("Hello Exceptions...!!!\n\n"+fe);
            }

        }
           
    
       
    }
}
