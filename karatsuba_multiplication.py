x = 5678
y = 1234

def karatsuba(x,y):
    stx = str(x)
    sty = str(y)

    nx = len(stx)
    ny = len(sty)

    if nx == 1 or ny == 1:
        return x * y

    base = max(nx,ny)
    half_base = base // 2

    bx = nx - half_base
    by = ny - half_base

    a = x // 10**(half_base)
    b = x % 10**(half_base)
    c = y // 10**(half_base)
    d = y % 10**(half_base)

    ac = karatsuba(a,c)
    bd = karatsuba(b,d)
    abcd = karatsuba((a+b),(c+d))

    return (ac * 10**(2*half_base)) + ((abcd - ac - bd) * 10**(half_base)) + (bd)