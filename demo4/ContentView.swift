//
//  ContentView.swift
//  demo4
//
//  Created by Santiago Barradas on 13/08/25.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text("MELANY HOLA")
          Button("MELANY") {
            /*@START_MENU_TOKEN@*//*@PLACEHOLDER=Action@*/ /*@END_MENU_TOKEN@*/
          }
          ColorPicker("Factor", selection: /*@START_MENU_TOKEN@*/.constant(.red)/*@END_MENU_TOKEN@*/)
        }
      EditButton()
        .padding()
    }
}

#Preview {
    ContentView()
}
