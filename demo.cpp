class demo
{
    public:

        virtual void someMethod(){}

        // pure virtual method
        virtual void someNewMethod() = 0;
};

class derivedDemo : public demo
{

    public:

        void someMethod(){}
};