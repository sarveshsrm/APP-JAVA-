#include<iostream>
#include<conio.h>
class student_054
{
    char rno[10];
    char name[10];
    float m1,m2,m3;
    float avg;
    public:
    void read_data();
    void compute();
    void display();
};
void student_054::read_data()
{
    cout<<"  Enter the Student Roll Number :";
    cin>>rno;
    cout<<"  Enter the Student Name:";
    cin>>name;
    cout<<"  Enter the marks in three subjects:n";
    cin>>m1>>m2>>m3;
}
void student_054::compute()
{
    avg=(m1+m2+m3)/3;
}
void  student_054::display()
{
    cout<<"n ------------------------------------------------------n";
    cout<<name<<" Detailsn";
    cout<<"n ------------------------------------------------------n";
    cout<<"  Rollno is "<<rno;
    cout<<"n  Name is "<<name;
    cout<<"n  Mark1 is "<<m1;
    cout<<"n  Mark2 is "<<m2;
    cout<<"n  Mark3 is "<<m3;
    cout<<"n  Average mark of three subjects is "<<avg;
    cout<<"n ------------------------------------------------------n";
}
void main()
{
    student_054 s[10];
    int n,i;
    clrscr();
    cout<<"n  Enter the number of Students:";
    cin>>n;
    for(i=0;i<n;i++)
    s[i].read_data();
    for(i=0;i<n;i++)
    s[i].compute();
    for(i=0;i<n;i++)
    s[i].display();
    getch();
}

