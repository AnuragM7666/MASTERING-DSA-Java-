/*
 * BULB SWITCHER PROBLEM
 * 
 * Problem Description:
 * There are n bulbs that are initially off. You first turn on all the bulbs, 
 * then you turn off every second bulb. On the third round, you toggle every 
 * third bulb (turn on if it's off or turn off if it's on). For the ith round, 
 * you toggle every i bulb. For the nth round, you only toggle the last bulb.
 * 
 * Find how many bulbs are on after n rounds.
 * 
 * Example:
 * n = 3
 * Round 1: [on, on, on]     (turn on all bulbs)
 * Round 2: [on, off, on]    (toggle every 2nd bulb)
 * Round 3: [on, off, off]   (toggle every 3rd bulb)
 * Result: 1 bulb is on
 */
public class bulbSwitcher {
    public int bulbSwitch(int n) {
        int count = 0; 
        int i = 1;     
        
        while (i*i <= n) {
            count++;    
            i++;       
        }
        
        return count;   
    }
    
    public static void main(String[] args) {
        bulbSwitcher sol = new bulbSwitcher();
        System.out.println(sol.bulbSwitch(5)); 
    }
}
