try:
    print(x) # type: ignore
except NameError:
    print("x is not defined")