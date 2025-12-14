import pandas
data = {
    "Username" : ["admin", "Charles", "Deku"],
    "Passwords" : ["password", "char113", "AllMight"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)

dataframe.to_csv("sample.csv", index = False)