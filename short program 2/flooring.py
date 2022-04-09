def SetLength():
    choice = int(input("Please enter the length "))
    return choice
def SetWidth():
    choice = int(input("Please enter the width "))
    return choice
def main():
    length = SetLength()
    width = SetWidth()
    print"length: ", length
    print"width: ",  width
    while length>= 10000 or width>= 10000:
        print "Please enter a length and width that is less than 10000 (in cm)"
        length = SetLength()
        width = SetWidth()
    area = ((length * width)/10000)
    wastage = area*0.1
    total = area + wastage
    total = total * 10
    total1 = int(total)
    total = float(total1)
    total = total/10
    print "Your room area is ", area, " m2\nThe extra you need for wastage is ", wastage, " m2\nThe total flooring area to order is: ", total, " m2"
main()
