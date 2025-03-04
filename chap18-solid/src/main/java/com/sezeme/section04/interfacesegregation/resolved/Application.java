package com.sezeme.section04.interfacesegregation.resolved;

public class Application {
    public static void main(String[] args) {
        PrintOnly printOnly = new BasicPrinter();
        printOnly.print();

        MultiFunctionPrinter multiFunctionPrinter = new AdvancedPrinter();
        multiFunctionPrinter.fax();
        multiFunctionPrinter.scan();
        multiFunctionPrinter.print();

    }
}
