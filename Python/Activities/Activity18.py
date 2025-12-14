import pandas

dataframe = pandas.read_csv("sample.csv")

print("Full Data:")
print(dataframe)

print("=====================")
print("Usernames: ")
print(dataframe["Username"])
print("=====================")
print("Username: ", dataframe["Username"][1], "|", "password: ", dataframe["Passwords"][1])
print("======================")
print("Data sorted in ascending username: ")
print(dataframe.sort_values('Username'))
print("============================")
print("Data sorted in descending passwords: ")
print(dataframe.sort_values('Passwords', ascending=False))