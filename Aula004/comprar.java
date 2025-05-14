package atv2;
import java.util.Scanner;

public class comprar {

	  
      public void inicio() {
    	  System.out.println("Seja bem vindo ao sistema de compras, analize o nosso estoque para começar a compar: ");
    	  System.out.println("Utencilios :");
    	  Prod();
    	  
      }  
      public void Prod() {
  		Scanner tec = new Scanner(System.in);
    	    int idesp = 1;
    	    int espe = 1;
    	    String espp = "Espatula de Silicone";
    	    System.out.println("ID: " + idesp + ", " + espp + ", Estoque: " + espe);
    	    int idclp = 2;
    	    int clpe = 1;
    	    String clpp = "Colher de Pau";
    	    System.out.println("ID: " + idclp + ", " + clpp + ", Estoque: " + clpe);
    	    int idpnm = 3;
    	    int pnm = 1;
    	    String pnnm = "Peneira Média";
    	    System.out.println("ID: " + idpnm + ", " + pnnm + ", Estoque: " + pnm);
    	    int idpnp = 4;
    	    int pnp = 1;
    	    String pnpp = "Peneira Pequena";
    	    System.out.println("ID: " + idpnp + ", " + pnpp + ", Estoque: " + pnp);
    	    int idtdc = 5;
    	    int tdc = 1;
    	    String tdcp = "Tábua de Corte ";
    	    System.out.println("ID: " + idtdc + ", " + tdcp + ", Estoque: " + tdc);
    	    int idram = 6;
    	    int ram = 1;
    	    String ramp = "Rolo para Abrir Massas ";
    	    System.out.println("ID: " + idram + ", " + ramp + ", Estoque: " + ram);
    	    int idpin = 7;
    	    int pin = 1;
    	    String pinp = "Pinça";
    	    System.out.println("ID: " + idpin + ", " + pinp + ", Estoque: " + pin);
    	    int idcdm = 8;
    	    int cdm = 1;
    	    String cdmp = "Conjunto de Medidores";
    	    System.out.println("ID: " + idcdm + ", " + cdmp + ", Estoque: " + cdm);
    	    int idxmd = 9;
    	    int xmd = 1;
    	    String xmdp = "Xícara de Medidas";
    	    System.out.println("ID: " + idxmd + ", " + xmdp + ", Estoque: " + xmd);
    	    int idscr = 10;
    	    int scr = 1;
    	    String scrp = "Saca-rolhas";
    	    System.out.println("ID: " + idscr + ", " + scrp + ", Estoque: " + scr);
    	    int idabl = 11;
    	    int abl = 1;
    	    String ablp = "Abridor de Latas";
    	    System.out.println("ID: " + idabl + ", " + ablp + ", Estoque: " + abl);
    	    int idabg = 12;
    	    int abg = 1;
    	    String abgp = "Abridor de Garrafas";
    	    System.out.println("ID: " + idabg + ", " + abgp + ", Estoque: " + abg);
    	    int idtes = 13;
    	    int tes = 1;
    	    String tesp = "Tesoura";
    	    System.out.println("ID: " + idtes + ", " + tesp + ", Estoque: " + tes);
    	    int idral = 14;
    	    int ral = 1;
    	    String ralp = "Ralador";
    	    System.out.println("ID: " + idral + ", " + ralp + ", Estoque: " + ral);
    	    int idfun = 15;
    	    int fun = 1;
    	    String funp = "Funil";
    	    System.out.println("ID: " + idfun + ", " + funp + ", Estoque: " + fun);
    	    int ideal = 16;
    	    int eal = 1;
    	    String ealp = "Espremedor de Alho";
    	    System.out.println("ID: " + ideal + ", " + ealp + ", Estoque: " + eal);
    	    int idpnmr = 17;
    	    int pnmr = 1;
    	    String pnmrp = "Panela Média";
    	    System.out.println("ID: " + idpnmr + ", " + pnmrp + ", Estoque: " + pnmr);
    	    int idpnpq = 18;
    	    int pnpq = 1;
    	    String pnppq = "Panela Pequena";
    	    System.out.println("ID: " + idpnpq + ", " + pnppq + ", Estoque: " + pnpq);
    	    int idpng = 19;
    	    int png = 1;
    	    String pngp = "Panela Grande";
    	    System.out.println("ID: " + idpng + ", " + pngp + ", Estoque: " + png);
    	    int idpnpge = 20;
    	    int pnpge = 1;
    	    String pnppr = "Panela de Pressão";
    	    System.out.println("ID: " + idpnpge + ", " + pnppr + ", Estoque: " + pnpge);
    	    int idfma = 21;
    	    int fma = 1;
    	    String fmap = "Frigideira Média Antiaderente com Tampa";
    	    System.out.println("ID: " + idfma + ", " + fmap + ", Estoque: " + fma);
    	    int idlcl = 22;
    	    int lcl = 1;
    	    String lclp = "Leiteira ou Caneca para Ferver Líquidos";
    	    System.out.println("ID: " + idlcl + ", " + lclp + ", Estoque: " + lcl);
    	    int idfpp = 23;
    	    int fpp = 2;
    	    String fppp = "Forma para Pizza";
    	    System.out.println("ID: " + idfpp + ", " + fppp + ", Estoque: " + fpp);
    	    int idfrt = 24;
    	    int frt = 1;
    	    String frtp = "Forma Retangular";
    	    System.out.println("ID: " + idfrt + ", " + frtp + ", Estoque: " + frt);
    	    int idfrd = 25;
    	    int frd = 1;
    	    String frdp = "Forma Redonda";
    	    System.out.println("ID: " + idfrd + ", " + frdp + ", Estoque: " + frd);
    	    int idfrf = 26;
    	    int frf = 1;
    	    String frfp = "Forma Redonda com Furo no Meio";
    	    System.out.println("ID: " + idfrf + ", " + frfp + ", Estoque: " + frf);
    	    int idcfg = 27;
    	    int cfg = 1;
    	    String cfgp = "Conjunto de Facas";
    	    System.out.println("ID: " + idcfg + ", " + cfgp + ", Estoque: " + cfg);
    	    int idcng = 28;
    	    int cng = 1;
    	    String cngp = "Concha Grande";
    	    System.out.println("ID: " + idcng + ", " + cngp + ", Estoque: " + cng);
    	    int idcnm = 29;
    	    int cnm = 1;
    	    String cnmp = "Concha Média";
    	    System.out.println("ID: " + idcnm + ", " + cnmp + ", Estoque: " + cnm);
    	    int idesc = 30;
    	    int esc = 1;
    	    String escp = "Escumadeira";
    	    System.out.println("ID: " + idesc + ", " + escp + ", Estoque: " + esc);
    	    int idgpa = 31;
    	    int gpa = 1;
    	    String gpap = "Garfão para Preparo de Alimentos, especialmente carnes";
    	    System.out.println("ID: " + idgpa + ", " + gpap + ", Estoque: " + gpa);
    	    int idemc = 32;
    	    int emc = 1;
    	    String emcp = "Escorredor de Macarrão";
    	    System.out.println("ID: " + idemc + ", " + emcp + ", Estoque: " + emc);
    	    int idfgd = 33;
    	    int fgd = 1;
    	    String fgdp = "Formas de Gelo (caso sua geladeira não possua)";
    	    System.out.println("ID: " + idfgd + ", " + fgdp + ", Estoque: " + fgd);
    	    int idppg = 34;
    	    int ppg = 2;
    	    String ppgp = "Pegadores de Panela";
    	    System.out.println("ID: " + idppg + ", " + ppgp + ", Estoque: " + ppg);
    	    int idlds = 35;
    	    int lds = 1;
    	    String ldsp = "Luva de Silicone";
    	    System.out.println("ID: " + idlds + ", " + ldsp + ", Estoque: " + lds);
    	    int idcdc = 36;
    	    int cdc = 1;
    	    String cdcp = "Coador de Café";
    	    System.out.println("ID: " + idcdc + ", " + cdcp + ", Estoque: " + cdc);
    	    int idchl = 37;
    	    int chl = 1;
    	    String chlp = "Chaleira";
    	    System.out.println("ID: " + idchl + ", " + chlp + ", Estoque: " + chl);
    	    System.out.println("Insira o id do produto que você quer comprar");
    	    int es = tec.nextInt();
  	      pagamento texto2 = new pagamento();

    	    switch (es) {
    	    case 1:
    	      System.out.println(espp+ " estoque: " + espe );
    	      System.out.println("Redirecionando para parte de pagamento...");
    	      texto2.pagar();
    	      break;
    	    case 2:
    	      System.out.println(clpp + " estoque: " + clpe);
    	      texto2.pagar();

    	      break;
    	    case 3:
    	      System.out.println(pnnm + " estoque: " + pnm);
    	      texto2.pagar();

    	      break;
    	    case 4:
    	      System.out.println(pnpp + " estoque: " + pnp);
    	      texto2.pagar();

    	      break;
    	    case 5:
    	      System.out.println(tdcp + " estoque: " + tdc);
    	      texto2.pagar();

    	      break;
    	    case 6:
    	      System.out.println(ramp + " estoque: " + ram);
    	      texto2.pagar();

    	      break;
    	    case 7:
    	      System.out.println(pinp + " estoque: " + pin);
    	      texto2.pagar();

    	      break;
    	    case 8:
    	      System.out.println(cdmp + " estoque: " + cdm);
    	      texto2.pagar();

    	      break;
    	    case 9:
    	      System.out.println(xmdp + " estoque: " + xmd);
    	      texto2.pagar();

    	      break;
    	    case 10:
    	      System.out.println(scrp + " estoque: " + scr);
    	      texto2.pagar();

    	      break;
    	    case 11:
    	      System.out.println(ablp + " estoque: " + abl);
    	      texto2.pagar();

    	      break;
    	    case 12:
    	      System.out.println(abgp + " estoque: " + abg);    	      texto2.pagar();

    	      break;
    	    case 13:
    	      System.out.println(tesp + " estoque: " + tes);    	      texto2.pagar();

    	      break;
    	    case 14:
    	      System.out.println(ralp + " estoque: " + ral);    	      texto2.pagar();

    	      break;
    	    case 15:
    	      System.out.println(funp + " estoque: " + fun);    	      texto2.pagar();

    	      break;
    	    case 16:
    	      System.out.println(ealp + " estoque: " + eal);    	      texto2.pagar();

    	      break;
    	    case 17:
    	      System.out.println(pnmrp + " estoque: " + pnmr);    	      texto2.pagar();

    	      break;
    	    case 18:
    	      System.out.println(pnppq + " estoque: " + pnpq);    	      texto2.pagar();

    	      break;
    	    case 19:
    	      System.out.println(pngp + " estoque: " + png);    	      texto2.pagar();

    	      break;
    	    case 20:
    	      System.out.println(pnppr + " estoque: " + pnpge);    	      texto2.pagar();

    	      break;
    	    case 21:
    	      System.out.println(fmap + " estoque: " + fma);    	      texto2.pagar();

    	      break;
    	    case 22:
    	      System.out.println(lclp + " estoque: " + lcl);    	      texto2.pagar();

    	      break;
    	    case 23:
    	      System.out.println(fppp + " estoque: " + fpp);    	      texto2.pagar();

    	      break;
    	    case 24:
    	      System.out.println(frtp + " estoque: " + frt);    	      texto2.pagar();

    	      break;
    	    case 25:
    	      System.out.println(frdp + " estoque: " + frd);    	      texto2.pagar();

    	      break;
    	    case 26:
    	      System.out.println(frfp + " estoque: " + frf);    	      texto2.pagar();

    	      break;
    	    case 27:
    	      System.out.println(cfgp + " estoque: " + cfg);    	      texto2.pagar();

    	      break;
    	    case 28:
    	      System.out.println(cngp + " estoque: " + cng);    	      texto2.pagar();

    	      break;
    	    case 29:
    	      System.out.println(cnmp + " estoque: " + cnm);    	      texto2.pagar();

    	      break;
    	    case 30:
    	      System.out.println(escp + " estoque: " + esc);    	      texto2.pagar();

    	      break;
    	    case 31:
    	      System.out.println(gpap + " estoque: " + gpa);    	      texto2.pagar();

    	      break;
    	    case 32:
    	      System.out.println(emcp + " estoque: " + emc);    	      texto2.pagar();

    	      break;
    	    case 33:
    	      System.out.println(fgdp + " estoque: " + fgd);    	      texto2.pagar();

    	      break;
    	    case 34:
    	      System.out.println(ppgp + " estoque: " + ppg);    	      texto2.pagar();

    	      break;
    	    case 35:
    	      System.out.println(ldsp + " estoque: " + lds);    	      texto2.pagar();

    	      break;
    	    case 36:
    	      System.out.println(cdcp + " estoque: " + cdc);    	      texto2.pagar();

    	      break;
    	    case 37:
    	      System.out.println(chlp + " estoque: " + chl);          texto2.pagar();

    	      break;
    	    default:
    	    	System.out.println("Parece que você tentou um id invalido, tente novamente");
    	  }
    	}
      
}
