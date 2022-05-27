import java.util.Scanner;

class Burc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int dogumGunu, dogumAyi, dogumYili;


            System.out.println("Doğum yılınızı giriniz: ");
                dogumYili = input.nextInt(); 

            System.out.println("Doğum ayınızı sayı olarak giriniz: ");
                dogumAyi = input.nextInt();

            System.out.println("Doğum gününüzü giriniz: ");
                dogumGunu = input.nextInt();

                if (dogumAyi == 1) {
                    if (dogumGunu <= 21 && dogumGunu >= 1) {
                        System.out.println("Güneş burcunuz: Oğlak");
                    }else if (dogumGunu > 22 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Kova");
                    }

                }else if (dogumAyi == 2) {

                    if ((dogumYili % 4 == 0)) {
                        if (dogumGunu >= 1 && dogumGunu <= 19) {
                            System.out.println("Güneş burcunuz: Kova");
                        }else if (dogumGunu > 19 && dogumGunu <= 29) {
                            System.out.println("Güneş burcunuz: Balık");
                        } 
                    } else if (dogumYili % 4 != 0) {
                        if (dogumGunu > 19 && dogumGunu <= 28) {
                            System.out.println("Güneş burcunuz: Balık");
                        }else if (dogumGunu >= 1 && dogumGunu <= 19) {
                            System.out.println("Güneş burcunuz: Kova");
                        }
                    }
                    
                } else if (dogumAyi == 3) {

                    if (dogumGunu >= 1 && dogumGunu <= 20) {
                        System.out.println("Güneş burcunuz: Balık");
                    }else if (dogumGunu > 20 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Koç");
                    }

                }else if (dogumAyi == 4) {

                    if (dogumGunu >= 1 && dogumGunu <= 20) {
                        System.out.println("Güneş burcunuz: Koç");
                    }else if (dogumGunu > 20 && dogumGunu <= 30) {
                        System.out.println("Güneş burcunuz: Boğa");
                    }

                }else if (dogumAyi == 5) {
                
                    if (dogumGunu >= 1 && dogumGunu <= 21) {
                        System.out.println("Güneş burcunuz: Boğa");
                    }else if (dogumGunu > 21 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: İkizler");
                    }

                }else if (dogumAyi == 6) {
                    if (dogumGunu >= 1 && dogumGunu <= 22) {
                        System.out.println("Güneş burcunuz: İkizler");
                    }else if (dogumGunu > 22 && dogumGunu <= 30) {
                        System.out.println("Güneş burcunuz: Yengeç");
                    }

                }else if (dogumAyi == 7) {
                    if (dogumGunu >= 1 && dogumGunu <= 22) {
                        System.out.println("Güneş burcunuz: Yengeç");
                    }else if (dogumGunu > 22 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Aslan");
                    }

                }else if (dogumAyi == 8) {
                    if (dogumGunu >= 1 && dogumGunu <= 23) {
                        System.out.println("Güneş burcunuz: Aslan");
                    }else if (dogumGunu > 23 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Başak");
                    }
                
                }else if (dogumAyi == 9) {
                    if (dogumGunu >= 1 && dogumGunu <= 22) {
                        System.out.println("Güneş burcunuz: Başak");
                    }else if (dogumGunu > 23 && dogumGunu <= 30) {
                        System.out.println("Güneş burcunuz: Terazi");
                    }

                }else if (dogumAyi == 10) {
                    if (dogumGunu >= 1 && dogumGunu <= 22) {
                        System.out.println("Güneş burcunuz: Terazi");
                    }else if (dogumGunu > 23 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Akrep");
                    }

                }else if (dogumAyi == 11) {
                    if (dogumGunu >= 1 && dogumGunu <= 23) {
                        System.out.println("Güneş burcunuz: Akrep");
                    }else if (dogumGunu > 23 && dogumGunu <= 30) {
                        System.out.println("Güneş burcunuz: Yay");
                    }

                }else if (dogumAyi == 12) {
                    if (dogumGunu >= 1 && dogumGunu <= 21) {
                        System.out.println("Güneş burcunuz: Yay");
                    }else if (dogumGunu > 21 && dogumGunu <= 31) {
                        System.out.println("Güneş burcunuz: Oğlak");
                    }
                }else {
                    System.out.println("Hatalı giriş yaptınız.");
                }

                }      
                           
} 


