package victor;

interface Element<Visitor> {
    void accept(Visitor visitor);
}