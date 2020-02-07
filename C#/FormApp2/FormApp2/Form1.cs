using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label9_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                double sum1 = double.Parse(text11.Text) * double.Parse(text12.Text);
                double sum2 = double.Parse(text21.Text) * double.Parse(text22.Text);
                double sum3 = double.Parse(text31.Text) * double.Parse(text32.Text);
                sum3 += sum2 + sum1;
                text_res.Text = sum3.ToString();
            }
            catch(Exception ex)
            {
                MessageBox.Show("Error...\n\n"+ex);
            }
        }
    }
}
