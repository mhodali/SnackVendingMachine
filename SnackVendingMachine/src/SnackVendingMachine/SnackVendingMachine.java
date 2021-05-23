package SnackVendingMachine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class SnackVendingMachine {
  private ArrayList < SnackSlot > SnackSlot = new ArrayList < SnackSlot > ();
  private ArrayList < CoinSlot > CoinSlot = new ArrayList < CoinSlot > ();
  private ArrayList < NoteSlot > NoteSlot = new ArrayList < NoteSlot > ();
  private ArrayList < Double > TotalMoney = new ArrayList < Double > ();
  private ArrayList < Double > balance = new ArrayList < Double > ();

  public void initilization() throws IOException {

    SnackSlot snackslot0 = new SnackSlot(5, 5, Item.Doritos);
    SnackSlot.add(snackslot0);
    SnackSlot snackslot1 = new SnackSlot(5, 5, Item.Cheetos);
    SnackSlot.add(snackslot1);
    SnackSlot snackslot2 = new SnackSlot(5, 5, Item.gum);
    SnackSlot.add(snackslot2);
    SnackSlot snackslot3 = new SnackSlot(5, 5, Item.Lays);
    SnackSlot.add(snackslot3);
    SnackSlot snackslot4 = new SnackSlot(5, 5, Item.Pringles);
    SnackSlot.add(snackslot4);
    CoinSlot coinslot0 = new CoinSlot(0.10, 10);
    CoinSlot.add(coinslot0);
    CoinSlot coinslot1 = new CoinSlot(0.20, 20);
    CoinSlot.add(coinslot1);
    CoinSlot coinslot2 = new CoinSlot(0.50, 20);
    CoinSlot.add(coinslot2);
    CoinSlot coinslot3 = new CoinSlot(1, 20);
    CoinSlot.add(coinslot3);
    NoteSlot noteslot0 = new NoteSlot(20, 20);
    NoteSlot.add(noteslot0);
    NoteSlot noteslot1 = new NoteSlot(50, 20);
    NoteSlot.add(noteslot1);
    TotalMoney.add((double) 0);
    balance.add((double) 0);
  }
  public void refill() throws IOException {

    SnackSlot snackslot0 = new SnackSlot(5, 5, Item.Doritos);
    SnackSlot.set(0, snackslot0);
    SnackSlot snackslot1 = new SnackSlot(5, 5, Item.Cheetos);
    SnackSlot.set(1, snackslot1);
    SnackSlot snackslot2 = new SnackSlot(5, 5, Item.gum);
    SnackSlot.set(2, snackslot2);
    SnackSlot snackslot3 = new SnackSlot(5, 5, Item.Lays);
    SnackSlot.set(3, snackslot3);
    SnackSlot snackslot4 = new SnackSlot(5, 5, Item.Pringles);
    SnackSlot.set(4, snackslot4);
    CoinSlot coinslot0 = new CoinSlot(0.10, 10);
    CoinSlot.set(0, coinslot0);
    CoinSlot coinslot1 = new CoinSlot(0.20, 20);
    CoinSlot.set(1, coinslot1);
    CoinSlot coinslot2 = new CoinSlot(0.50, 20);
    CoinSlot.set(2, coinslot2);
    CoinSlot coinslot3 = new CoinSlot(1, 20);
    CoinSlot.set(3, coinslot3);
    NoteSlot noteslot0 = new NoteSlot(20, 20);
    NoteSlot.set(0, noteslot0);
    NoteSlot noteslot1 = new NoteSlot(50, 20);
    NoteSlot.set(1, noteslot1);
    TotalMoney.set(0, (double) 0);
    balance.set(0, (double) 0);
  }
  public void getorder() throws IOException {
    while (true) {
      if (SnackSlot.get(0).getQuantity() > 1 && SnackSlot.get(1).getQuantity() > 1 &&
        SnackSlot.get(2).getQuantity() > 1 && SnackSlot.get(3).getQuantity() > 1 &&
        SnackSlot.get(4).getQuantity() > 1 && CoinSlot.get(1).getValue() > 5 &&
        CoinSlot.get(2).getValue() > 5 && CoinSlot.get(3).getValue() > 5 &&
        NoteSlot.get(0).getValue() > 5 && NoteSlot.get(1).getValue() > 5) {
        Double itemprice;
        for (int i = 0; i < SnackSlot.size(); i++) {
          for (int j = 0; j < SnackSlot.get(i).getQuantity(); j++) {
            System.out.print("" + SnackSlot.get(i).getItem().getItemName() + ":" + i + "" + j + "  \t");
          }
          System.out.println();
        }
        int itemnum;
        while (true) {
          itemnum = getitem();
          if (itemnum != -1) {
            break;
          }
        }
        int row = itemnum / 10;
        int colmun = itemnum % 10;
        itemprice = SnackSlot.get(row).getItem().getPrice();
        //SnackSlot.get(row).setQuantity(SnackSlot.get(row).getQuantity()-1);

        do {
          Scanner in = new Scanner(System.in);
          System.out.println("please enter the way to insert money: coins , note , card");
          String wayofpayment = in .nextLine();
          if (wayofpayment.equals("coins")) {
            boolean flag = true;
            while (flag != false && balance.get(0) < itemprice) {
              System.out.println("please enter one of these coins 10c 20c 50c 1$ or exit to change the way 20$ 50$ ,you can use card ");
              String choice = in .nextLine();
              if (choice.equals("10c")) {
                TotalMoney.set(0, TotalMoney.get(0) + 0.1);
                this.balance.set(0, this.balance.get(0) + 0.1);
                CoinSlot.get(0).setValue(CoinSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("20c")) {
                TotalMoney.set(0, TotalMoney.get(0) + 0.2);
                this.balance.set(0, this.balance.get(0) + 0.2);
                CoinSlot.get(1).setValue(CoinSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("50c")) {
                TotalMoney.set(0, TotalMoney.get(0) + 0.5);
                this.balance.set(0, this.balance.get(0) + 0.5);
                CoinSlot.get(2).setValue(CoinSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("1$")) {
                TotalMoney.set(0, TotalMoney.get(0) + 1);
                this.balance.set(0, this.balance.get(0) + 1);
                CoinSlot.get(3).setValue(CoinSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("exit"))

              {
                flag = false;
              } else {
                System.out.println("wrong coin ! ,please enter one of these coins 10c 20c 50c 1$ or exit to change the way ");
              }
            }
          } else if (wayofpayment.equals("note")) {
            boolean flag = true;
            while (flag != false && balance.get(0) < itemprice) {
              System.out.println("please enter one of these 20$ 50$ ");
              String choice = in .nextLine();
              if (choice.equals("20$")) {
                TotalMoney.set(0, TotalMoney.get(0) + 20);
                this.balance.set(0, this.balance.get(0) + 20);
                NoteSlot.get(0).setValue(NoteSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("50$")) {
                TotalMoney.set(0, TotalMoney.get(0) + 50);
                this.balance.set(0, this.balance.get(0) + 50);
                NoteSlot.get(1).setValue(NoteSlot.get(0).getValue() + 1);
                System.out.println("balance=" + balance.get(0));
              } else if (choice.equals("exit"))

              {
                flag = false;
              } else {
                System.out.println("wrong coin ! ,please enter one of these 20$ 50$ or exit to change the way ");
              }
            }
          } else if (wayofpayment.equals("card")) //suppose card always have money
          {
            TotalMoney.set(0, TotalMoney.get(0) + itemprice);
            this.balance.set(0, this.balance.get(0) + itemprice);
            System.out.println("balance=" + balance.get(0));
          }

        } while (itemprice > balance.get(0));
        balance.set(0, balance.get(0) - itemprice);
        System.out.println("take your " + SnackSlot.get(row).getItem().getItemName() + " from machine " + "\n" + "balance=" + balance.get(0));
        SnackSlot.get(row).setQuantity(SnackSlot.get(row).getQuantity() - 1);
        int tencent = 0, twanycent = 0, fiftycent = 0, onedollar = 0, twanydollar = 0, fiftydollar = 0;
        double returnedbalance = 0;
        if (balance.get(0) != 0) {
          while (returnedbalance != balance.get(0) && returnedbalance < balance.get(0)) {
            if (NoteSlot.get(1).getValue() > 0 && balance.get(0) - returnedbalance >= 50) {
              returnedbalance = returnedbalance + 50;
              NoteSlot.get(1).setValue(NoteSlot.get(1).getValue() - 1);
              fiftydollar++;
            } else if (NoteSlot.get(0).getValue() > 0 && balance.get(0) - returnedbalance >= 20) {
              returnedbalance = returnedbalance + 20;
              NoteSlot.get(0).setValue(NoteSlot.get(0).getValue() - 1);
              twanydollar++;
            } else if (CoinSlot.get(3).getValue() > 0 && balance.get(0) - returnedbalance >= 1) {
              returnedbalance = returnedbalance + 1;
              CoinSlot.get(3).setValue(CoinSlot.get(3).getValue() - 1);

              onedollar++;
            } else if (CoinSlot.get(2).getValue() > 0 && balance.get(0) - returnedbalance >= 0.5) {
              returnedbalance = returnedbalance + 0.5;
              CoinSlot.get(2).setValue(CoinSlot.get(2).getValue() - 1);
              fiftycent++;
            } else if (CoinSlot.get(1).getValue() > 0 && balance.get(0) - returnedbalance >= 0.2) {
              returnedbalance = returnedbalance + 0.2;
              CoinSlot.get(1).setValue(CoinSlot.get(1).getValue() - 1);
              twanycent++;
            } else if (CoinSlot.get(0).getValue() > 0 && balance.get(0) - returnedbalance >= 0.1) {
              returnedbalance = returnedbalance + 0.1;
              CoinSlot.get(0).setValue(CoinSlot.get(0).getValue() - 1);
              tencent++;
            } else if (balance.get(0) - returnedbalance < 0.1) {
              break;
            }
          }
          TotalMoney.set(0, TotalMoney.get(0) - returnedbalance);
          this.balance.set(0, 0.0);
          System.out.println("balance=" + balance.get(0) + " , 10c= " + tencent + " , 20c=" + twanycent + " , 50c=" + fiftycent + " , 1$=" + onedollar + " , 20$=" + twanydollar + " , 50$=" + fiftydollar);

        }
      } else {
        this.refill();
      }
    }
  }

  public int getitem() {
    Scanner in = new Scanner(System.in);
    int num = 0;
    try {
      do {
        System.out.println("please enter the snack number ");
        num = in .nextInt();

      } while (validateitem(num) != true);
      return num;
    } catch (Exception e) {
      System.out.println("wrong input!! please enter one of prented numbers");
    }
    return -1;
  }
  public boolean validateitem(int number) {
    int row = number / 10;
    int colmun = number % 10;
    try {
      if (SnackSlot.get(row).getQuantity() > colmun) {
        //SnackSlot.get(row).setQuantity(SnackSlot.get(row).getQuantity()-1);
        System.out.println("price: " + SnackSlot.get(row).getItem().getPrice());

        return true;
      }
      System.out.println("snack not available enter another one");
      return false;
    } catch (Exception e) {
      System.out.println("wrong input!! please enter one of prented numbers");
    }
    return false;
  }
}