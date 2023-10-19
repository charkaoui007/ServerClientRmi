/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import service.MachineService;
import service.SalleService;


public class TestSalle {
    public static void main(String[] args) throws RemoteException {
        SalleService ss = new SalleService();
	       MachineService s= new MachineService();
             
               for(Machine m: s.findBySalleId(1)){
                   System.out.println(m.toString());
               }
                        
                        

////		
//		ss.delete(ss.findById(1));
		
		
//		ms.create(new Machine("PO45", "HP", 10000, new Date(), ss.findById(2)));
//		ms.create(new Machine("RT45", "Lenovo", 7000, new Date(), ss.findById(2)));
//		ms.create(new Machine("CC45", "Deel", 9000, new Date(), ss.findById(3)));
                /*	
		
		for(Salle s1 : ss.findAll()) {
			System.out.println(s1+" \n ses machines : ");
			for(Machine m : ms.findAll()) {
				if(m.getSalle().getId() == s1.getId())
					System.out.println("\t"+m);
			}
		}*/
		
    }
    	
}
