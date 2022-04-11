package ru.innopolis.problem2;

// your solution here
//fix all the errors including package errors
interface Command{
    void execute();
}
class StockTrader{
    private Command buyCommand;
    private Command sellCommand;

    public StockTrader(Command buyCommand, Command sellCommand) {
        this.buyCommand = buyCommand;
        this.sellCommand = sellCommand;
    }
    public void Buy(){
        buyCommand.execute();
    }
    public void Sell(){
        sellCommand.execute();
    }
}
class Stocks{
    public void add(){

    }
    public void remove(){

    }
}
class BuyCommand implements Command{
    private Stocks stocks;

    public BuyCommand(Stocks stocks) {
        this.stocks = stocks;
    }

    @Override
    public void execute() {
        stocks.add();
    }
}
class SellCommand implements Command{
    public SellCommand(Stocks stocks) {
        this.stocks = stocks;
    }

    private Stocks stocks;
    @Override
    public void execute() {
        stocks.remove();
    }
}