package PieToast;
import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Enemy Tim=new Enemy(10, "Tim", 40, 30);
		System.out.println("Attack "+Tim.getName()+"? 1=yes 2=no");
		int attacktim=scan.nextInt();
		int phealth=100;
		int pattack=10;
		if (attacktim==1){
			Tim.sethealth(Tim.gethealth()-pattack);
			System.out.println("You attack "+Tim.getName()+". "+Tim.getName()+"'s health:"+Tim.gethealth()+".");
			Enemy Joe=new Enemy(30, "Joe", 50, 45);
			System.out.println("Your attack goes up by 10.");
			pattack=pattack+10;
			System.out.println("Attack "+Joe.getName()+"? 1=yes 2=no"); 
			int attackjoe=scan.nextInt();
			if (attackjoe==1){
				Joe.sethealth(Joe.gethealth()-pattack);
				System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
				phealth=phealth-Joe.getdamage();
				if(phealth>0) {
					System.out.println(Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack Joe? 1=yes 2=no. attackjoe");
					int attackjoe16=scan.nextInt();
					if(attackjoe16==1) {
						System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
					}else {
						phealth=phealth-Joe.getdamage();
						System.out.println(Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+".");
					}
				}else{
					System.out.println(Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You Died.");
				}
				if (phealth>0){
					System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe");
					int attackjoe2=scan.nextInt();
					if (attackjoe2==1){
						Joe.sethealth(Joe.gethealth()-pattack);
						System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe2");
						int attackjoe14=scan.nextInt();
						if (attackjoe14==1) {
							Joe.sethealth(Joe.gethealth()-pattack);
							System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health: "+Joe.gethealth()+".");
						}else{
							phealth=phealth-Joe.getdamage();
							if (phealth>0) {
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe14");
							int attackjoe15=scan.nextInt();
							if (attackjoe15==1) {
								System.out.println(""+""+""+"You attack "+Joe.getName()+". "+Joe.getName()+"'s health: "+Joe.gethealth()+".");
								Enemy Bomm=new Enemy(0, "Bomm", 0, 0);
								int attackbomm2=scan.nextInt();
								if (attackbomm2==1) {
									phealth=0;
									System.out.println("You attack "+Bomm.getName()+". The bomb blew up. You died.");
								}else{
								System.out.println("You do not attack."+Bomm.getName()+"He explodes a safe distance from you. YOU WIN!!! Your prize:");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("Pig World!");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("You actually just won a prank on yourself! You get nothing!");
								}
							}else {
								phealth=phealth-Joe.getdamage();
								if (phealth>0)
								System.out.println(Joe.getName()+" comes toward you and atttacks you.");
							}
							}
						}
					}
				}else{
					System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
				}
				int attackjoe9=scan.nextInt();
				if(attackjoe9==1){
					Joe.sethealth(Joe.gethealth()-pattack);
					System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
					phealth=phealth-Joe.getdamage();
					if (phealth>0){
						System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe9");
						int attackjoe10=scan.nextInt();
						if (attackjoe10==1){
							Joe.sethealth(Joe.gethealth()-pattack);
							System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
							phealth=phealth-Joe.getdamage();
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe10");
							if (phealth>0){
								System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
							}else{
								System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
							}
						}else{
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack"+Joe.getName()+"? 1=yes 2=no attackjoe10");
						}
					}else{
						System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
					}
				}else{
					System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack"+Joe.getName()+"? 1=yes 2=no. attackjoe9");
				}
			}else{
				phealth=phealth-Joe.getdamage();
				if (phealth>0){
					System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no attackjoe");
					int attackjoe11=scan.nextInt();
					if(attackjoe11==1){
						Joe.sethealth(Joe.gethealth()-pattack);
						System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
					}
				}else{
					System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
				}
			}
		}else{
			phealth=phealth-Tim.getdamage();
			System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Tim.getName()+"? 1=yes 2=no. attacktim");
			int attacktim2=scan.nextInt();
			if (attacktim2==1){
				Tim.sethealth(Tim.gethealth()-pattack);
				System.out.println("You attack "+Tim.getName()+". "+Tim.getName()+"'s health:"+Tim.gethealth()+".");
				pattack=pattack+10;
				System.out.println("Your attack goes up by 10.");
				Enemy Joe=new Enemy(30, "Joe", 50, 40);
				System.out.println("Attack "+Joe.getName()+"? 1=yes 2=no");
				int attackjoe=scan.nextInt();
				if (attackjoe==1) {
					int attackjoe15=scan.nextInt();
					if (attackjoe15==1){
						Joe.sethealth(Joe.gethealth()-pattack);
						System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
						phealth=phealth-Joe.getdamage();
						if (phealth>0){
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe3");
							int attackjoe4=scan.nextInt();
							if (attackjoe4==1){
								Joe.sethealth(Joe.gethealth()-pattack);
								System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
								Enemy Bomm=new Enemy(0, "Bomm", 0, 0);
								System.out.println("Attack "+Bomm.getName()+"? 1=yes 2=no.");
								int attackbomm3=scan.nextInt();
								if (attackbomm3==1) {
									phealth=0;
									System.out.println("You attack "+Bomm.getName()+". The bomb blew up. You died.");
								}else{
								System.out.println("You do not attack."+Bomm.getName()+"He explodes a safe distance from you. YOU WIN!!! Your prize:");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("Pig World!");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("You actually just won a prank on yourself! You get nothing!");
								}
							}else{
								phealth=phealth-Joe.getdamage();
								System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no. attackjoe4");
								int attackjoe12=scan.nextInt();
								if (attackjoe12==1){
									Joe.sethealth(Joe.gethealth()-pattack);
									System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health: "+Joe.gethealth());
									Enemy Bomm=new Enemy(0, "Bomm", 0, 0);
									int attackbomm=scan.nextInt();
									if (attackbomm==1) {
										phealth=0;
										System.out.println("You attack "+Bomm.getName()+". The bomb blew up. You died.");
									}else{
									System.out.println("You do not attack."+Bomm.getName()+"He explodes a safe distance from you. YOU WIN!!! Your prize:");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("Pig World!");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("You actually just won a prank on yourself! You get nothing!");
									}
								}else{
									System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". attackjoe12");
								}
							}
						}else{
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
						}
					}else{
						phealth=phealth-Joe.getdamage();
						System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no attackjoe3");
						int attackjoe13=scan.nextInt();
						if (attackjoe13==1){
							Joe.sethealth(Joe.gethealth()-pattack);
							System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
							phealth=phealth-Joe.getdamage();
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+".");
						}else{
							System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
						}
					}
				}else{
					phealth=phealth-Joe.getdamage();
					if (phealth>0){
						System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no");
						int attackjoe3=scan.nextInt();
						if (attackjoe3==1){
							Tim.sethealth(Tim.gethealth()-pattack);
							System.out.println("You attack "+Tim.getName()+". "+Tim.getName()+"'s health:"+Tim.gethealth()+".");
							//Enemy Joe=new Enemy(30, "Joe", 50, 40);
							System.out.println("Your attack goes up by 10.");
							pattack=pattack+10;
							System.out.println("Attack "+Joe.getName()+"? 1=yes 2=no");
							int attackjoe5=scan.nextInt();
							if (attackjoe5==1){
								Joe.sethealth(Joe.gethealth()-pattack);
								System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
								phealth=phealth-Joe.getdamage();
								if(phealth>0){
									System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no");
									int attackjoe6=scan.nextInt();
									if (attackjoe6==1){
										Joe.sethealth(Joe.gethealth()-pattack);
										System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
										Enemy Bomm=new Enemy(0, "Bomm", 0, 0);
										int attackbomm=scan.nextInt();
										if (attackbomm==1) {
											phealth=0;
											System.out.println("You attack "+Bomm.getName()+". The bomb blew up. You died.");
										}else{
										System.out.println("You do not attack."+Bomm.getName()+"He explodes a safe distance from you. YOU WIN!!! Your prize:");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("Pig World!");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("You actually just won a prank on yourself! You get nothing!");
										}
									}else{
										phealth=phealth-Joe.getdamage();
										System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+".");
									}
								}else{
									System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
								}
							}
						}else{
							phealth=phealth-Tim.getdamage();
							if (phealth>0){
								System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Tim.getName()+"? 1=yes 2=no");
								int attacktim4=scan.nextInt();
								if (attacktim4==1){
									Tim.sethealth(Tim.gethealth()-pattack);
									System.out.println("You attack "+Tim.getName()+". "+Tim.getName()+"'s health: "+Tim.gethealth()+".");
									// Enemy Joe=new Enemy(30, "Joe", 50, 40);
									System.out.println("Your attack goes up by 10.");
									pattack=pattack+10;
									System.out.println("Attack "+Joe.getName()+"? 1=yes 2=no");
									int attackjoe7=scan.nextInt();
									if (attackjoe7==1){
										if(phealth>0){
											Joe.sethealth(Joe.gethealth()-pattack);
											System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
											phealth=phealth-Joe.getdamage();
											if(phealth>0){
												System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". Attack "+Joe.getName()+"? 1=yes 2=no");
												int attackjoe8=scan.nextInt();
												if (attackjoe8==1){
													Joe.sethealth(Joe.gethealth()-pattack);
													if(phealth>0){
														System.out.println("You attack "+Joe.getName()+". "+Joe.getName()+"'s health:"+Joe.gethealth()+".");
														Enemy Bomm=new Enemy(0, "Bomm", 0, 0);
														int attackbomm=scan.nextInt();
														if (attackbomm==1) {
															phealth=0;
															System.out.println("You attack "+Bomm.getName()+". The bomb blew up. You died.");
														}else{
														System.out.println("You do not attack."+Bomm.getName()+"He explodes a safe distance from you. YOU WIN!!! Your prize:");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("Pig World!");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("");
														System.out.println("You actually just won a prank on yourself! You get nothing!");
														}
													}else{
														System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
													}

												}
											}else{
												System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
											}
										}else{
											System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
										}
									}else{
										System.out.println(""+Joe.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
									}
								}else{
									phealth=phealth-Tim.getdamage();
									System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
								}
							}else{
								phealth=phealth-Tim.getdamage();
								System.out.println(""+Tim.getName()+" comes toward you and attacks you. Your health: "+phealth+". You died.");
							}
					}

				}
			}
		}
	}
}
}