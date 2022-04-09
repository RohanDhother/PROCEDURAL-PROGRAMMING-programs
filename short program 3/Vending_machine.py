def GetOption(Sweet):
    return Sweet.option
def GetName(Sweet):
    return Sweet.name
def GetPrice(Sweet):
    return Sweet.price
def AskForOption(Sweets_array):
    choice = raw_input("Choose from\nA: Packet of Crisps\nB: Health Bar\nC: Bar of Chocolate\nOption: ")
    found = False
    for i in range(3):
        if GetOption(Sweets_array[i])==choice:
            index = i
            found = True
    while found==False:
        print "Please enter valid option"
        AskForOption(Sweets_array)
    return index
def PopArray(Sweets, Sweets_array):
    Sweet = Sweets("A", "A Packet of Crisps", 1.50)
    Sweets_array.append(Sweet)
    Sweet = Sweets("B", "A Health Bar", 1.20)
    Sweets_array.append(Sweet)
    Sweet = Sweets("C", "A Bar of Chocolate", 2.00)
    Sweets_array.append(Sweet)
    return Sweets_array
def PrintResponse(name, price):
    print name, " cost is ", price
def main():
    Sweets_array=[]
    Sweets_array = PopArray(Sweets, Sweets_array)
    index = AskForOption(Sweets_array)
    name = GetName(Sweets_array[index])
    price = GetPrice(Sweets_array[index])
    PrintResponse(name, price)
class Sweets:
    def __init__(self, option, name, price):
        self.option = option
        self.name = name
        self.price = price
main()
