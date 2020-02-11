public class Printer {

    public static void main(String[] args) {

    //The printer object is created either using the
    //Queue class or the QueueArray class (put in comment
    //one or the other).
    //Queue printer = new Queue();
    QueueArray printer = new QueueArray();

    if (printer.isEmpty())
        System.out.println("No jobs in queue.");
    else
        System.out.println("Jobs in the queue.");
    
    printer.enqueue ("Job 1");
    printer.enqueue ("Job 2"); 
    printer.enqueue ("Job 3");

    while (!printer.isEmpty())
        System.out.println(printer.dequeue());

    }
}