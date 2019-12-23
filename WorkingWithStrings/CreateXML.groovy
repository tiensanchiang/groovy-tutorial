#!/usr/bin/env groovy

langs = [ 'C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy' ]

content = ''
langs.each { lang, author->
    fragment="""
             <language name="${lang}">
                <author>${author}</author>
             </language>
             """
    content += fragment
}

println content
