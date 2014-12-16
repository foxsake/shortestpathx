
import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author .foxsake
 */
public class PathButton extends JButton {
    private boolean blocked;
    private boolean isStart;
    private boolean isFinish;
    private int row;
    private int col;
    
    public PathButton(){
        blocked = false;
        isStart = false;
        isFinish = false;
        this.setFont(new java.awt.Font("Arial", 0, 20));
        setForeground(Color.white);
    }
    
    public PathButton(int row,int col){
        blocked = false;
        isStart = false;
        isFinish = false;
        this.row = row;
        this.col = col;
        this.setFont(new java.awt.Font("Arial", 0, 20));
        setForeground(Color.white);
    }
    
    public boolean isBlocked(){
        return blocked;
    }
    
    public void setBlocked(boolean toBlock){
        if(!(isStart||isFinish)){
            blocked = toBlock;
            if(toBlock)
                setBackground(Color.black);
            else
                resetBg();
        }
    }
    
    public boolean isStart(){
        return isStart;
    }
    
    public boolean isFinish(){
        return isFinish;
    }
    
    public void setStart(boolean stat){
        isStart = stat;
        if(stat){
            blocked = false;
            setFont(new java.awt.Font("Arial", 0, 28));
            setBackground(Color.red);
            setText("S");
        }else{
            this.setFont(new java.awt.Font("Arial", 0, 20));
            reset();
        }
    }
    
    public void setFinish(boolean stat){
        isFinish = stat;
        if(stat){
            blocked = false;
            setFont(new java.awt.Font("Arial", 0, 28));
            setBackground(Color.red);
            setText("F");
        }else{
            this.setFont(new java.awt.Font("Arial", 0, 20));
            reset();
        }
    }
    
    public int getRow(){
        return row;
    }
    
    public int getCol(){
        return col;
    }
    
    public void reset(){
        resetBg();
        resetText();
    }
    
    public void resetBg(){
        setBackground(new JButton().getBackground());
    }
    
    public void resetText(){
        setText("");
    }
}
