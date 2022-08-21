import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MyButton extends Button{
	int z;
	public void paint(Graphics g){
		if(z==0){
			g.drawRect(10,10,20,20);
		}
		else if(z==1){
			g.drawOval(10,10,20,20);
		}
		else if(z==2){
			g.drawRoundRect(10,10,20,20,5,5);
		}
		else if(z==3){
			g.drawLine(10,10,30,30);
		}
	}
}
class DrawRect{
  int x1,y1,x2,y2;
  Color c=Color.BLACK;
  DrawRect(int x1,int y1,int x2,int y2,Color c)
   {
     this.x1=x1;
     this.y1=y1;
     this.x2=x2;
     this.y2=y2;
     this.c=c;
   }
	
}
class DrawOval{
  int x1,y1,x2,y2;
  Color c;
  DrawOval(int x1,int y1,int x2,int y2,Color c)
   {
     this.x1=x1;
     this.y1=y1;
     this.x2=x2;
     this.y2=y2;
	 this.c=c;
   }
}
class DrawRoundRect{
  int x1,y1,x2,y2;
  Color c;
  DrawRoundRect(int x1,int y1,int x2,int y2,Color c)
   {
     this.x1=x1;
     this.y1=y1;
     this.x2=x2;
     this.y2=y2;
	 this.c=c;
   }
}
class DrawLine{
  int x1,y1,x2,y2;
  Color c;
  DrawLine(int x1,int y1,int x2,int y2,Color c)
   {
     this.x1=x1;
     this.y1=y1;
     this.x2=x2;
     this.y2=y2;
	 this.c=c;
   }
}
class MyPanel extends Panel{
	Color c;
	int x;
	int x1,y1,x2,y2;
                 ArrayList<DrawRect>a1=new ArrayList<>();
	ArrayList<DrawOval> a2=new ArrayList<>();
	ArrayList<DrawRoundRect> a3=new ArrayList<>();
	ArrayList<DrawLine> a4=new ArrayList<>();
	
	public void paint(Graphics g){
	    for(DrawRect r:a1){
			   g.setColor(r.c);
               g.drawRect(r.x1,r.y1,r.x2-r.x1,r.y2-r.y1);
            }
		for(DrawOval r:a2){
			   g.setColor(r.);
               g.drawOval(r.x1,r.y1,r.x2-r.x1,r.y2-r.y1);
            }
		for(DrawRoundRect r:a3){
			g.setColor(r.c);
            g.drawRoundRect(r.x1,r.y1,r.x2-r.x1,r.y2-r.y1,30,30);
        }
		for(DrawLine r:a4){
			   g.setColor(r.c);
               g.drawLine(r.x1,r.y1,r.x2-r.x1,r.y2-r.y1);
            }
		if(x==1){
			if(c==Color.RED){
		       g.setColor(Color.RED);
		}
		else if (c==Color.GREEN){
			   g.setColor(Color.GREEN);
			   }
	    else if(c==Color.BLUE){
			   g.setColor(Color.BLUE);
		}
		else if(c==Color.YELLOW){
			g.setColor(Color.YELLOW);
		}
           g.drawRect(x1,y1,x2-x1,y2-y1);
		}
		if(x==2){
			if(c==Color.RED){
		       g.setColor(Color.RED);
		}
		else if (c==Color.GREEN){
			   g.setColor(Color.GREEN);
			   }
	    else if(c==Color.BLUE){
			   g.setColor(Color.BLUE);
		}
		else if(c==Color.YELLOW){
			g.setColor(Color.YELLOW);
		}
			
            g.drawOval(x1,y1,x2-x1,y2-y1);
		}
		if(x==3){
			if(c==Color.RED){
		       g.setColor(Color.RED);
		}
		else if (c==Color.GREEN){
			   g.setColor(Color.GREEN);
			   }
	    else if(c==Color.BLUE){
			   g.setColor(Color.BLUE);
		}
		else if(c==Color.YELLOW){
			g.setColor(Color.YELLOW);
		}
			g.drawRoundRect(x1,y1,x2-x1,y2-y1,30,30);
		}
		if(x==4){
			if(c==Color.RED){
		       g.setColor(Color.RED);
		}
		else if (c==Color.GREEN){
			   g.setColor(Color.GREEN);
			   }
	    else if(c==Color.BLUE){
			   g.setColor(Color.BLUE);
		}
		else if(c==Color.YELLOW){
			g.setColor(Color.YELLOW);
		}
			g.drawLine(x1,y1,x2-x1,y2-y1);
		}
		
	}
}
class MyPaint implements ActionListener{
	int a;
	Frame f;
	Panel p1,p2;
	MyPanel p3;
	MyButton b1[]=new MyButton[4];
	Button b2[]=new Button[4];
	Label l;
	
	WindowAdapter wl= new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			f.dispose();
		}
	};
    MyPaint(){
		f=new Frame("Paint");
		p1=new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(10,150,50,200);
		p2=new Panel();
		p2.setLayout(new GridLayout(1,4));
		p2.setBounds(130,450,250,150);
		p3=new MyPanel();
		p3.setBounds(60,50,440,400);
		l=new Label("0,0");
		l.setBounds(10,20,500,50);
		l.setFont(new Font("Arial",1,13));
		for (int i=0;i<4;i++){
			b1[i]=new MyButton();
	                 b2[i]=new Button();
			b1[i].addActionListener(this);
			b2[i].addActionListener(this);
			b1[i].z=i;
			p1.add(b1[i]);
			p2.add(b2[i]);
		}
		b2[0].setBackground(Color.RED);
		b2[1].setBackground(Color.GREEN);
		b2[2].setBackground(Color.BLUE);
		b2[3].setBackground(Color.YELLOW);
		f.addWindowListener(wl);
		f.setLayout(null);
		f.add(p1,BorderLayout.EAST);
		f.add(p2,BorderLayout.SOUTH);
		f.setSize(500,500);
		f.setVisible(true);
	    MouseMotionAdapter mma=new MouseMotionAdapter(){
		    public void mouseMoved(MouseEvent e){
				String s=e.getX()+","+e.getY();
				l.setText(s);
			}	
	        public void mouseDragged(MouseEvent e){
		        p3.x2=e.getX();
                p3.y2=e.getY();
				if(a==1){
					p3.x=1;
					p3.repaint();
				}
				if(a==2){
					p3.x=2;
					p3.repaint();
				}
				if(a==3){
					p3.x=3;
					p3.repaint();
				}
				if(a==4){
					p3.x=4;
					p3.repaint();
				}
	        }
		};
	    MouseAdapter ma=new MouseAdapter(){
		    public void mouseClicked(MouseEvent e){
	
	        }
	        public void mousePressed(MouseEvent e){
		           p3.x1=e.getX();
                   p3.y1=e.getY();
	        }   
	        public void mouseReleased(MouseEvent e){
				if(a==1){
		           DrawRect r=new DrawRect(p3.x1,p3.y1,p3.x2,p3.y2,p3.c);
                    p3.a1.add(r);
				}
				else if(a==2){
		           DrawOval r=new DrawOval(p3.x1,p3.y1,p3.x2,p3.y2,p3.c);
                   p3.a2.add(r);
				}
				else if(a==3){
		           DrawRoundRect r=new DrawRoundRect(p3.x1,p3.y1,p3.x2,p3.y2,p3.c);
                   p3.a3.add(r);
				}
				else{
		           DrawLine r=new DrawLine(p3.x1,p3.y1,p3.x2,p3.y2,p3.c);
                   p3.a4.add(r);
				}
				
				
	        }
		
	    };
	    p3.addMouseMotionListener(mma);
	    p3.addMouseListener(ma);
	    f.add(p3);
		f.add(l,BorderLayout.NORTH);
    }
	
	public static void main(String ar[]){
		new MyPaint();
	}
	
	public void actionPerformed(ActionEvent e){
		Button bt=(Button)e.getSource();
		Button b=(Button)e.getSource();
		if(bt==b1[0]||bt==b1[1]||bt==b1[2]||bt==b1[3]){
		  if(bt==b1[0]){
			a=1;
		  }
		  else if(bt==b1[1]){
			a=2;
		  }
		  else if(bt==b1[2]){
			a=3;
		  }
		  else if(bt==b1[3]){
			a=4;
		  }
		}
		else{
			if(b==b2[0]){
				p3.c=Color.RED;
			}
			else if(b==b2[1]){
				p3.c=Color.GREEN;
			}
			else if(b==b2[2]){
				p3.c=Color.BLUE;
			}
			else if(b==b2[3]){
				p3.c=Color.YELLOW;
			}
		}
		
		
		
	}
	
	
}
